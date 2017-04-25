package kotterknife

import android.content.Context
import android.widget.FrameLayout
import android.widget.TextView
import android.test.AndroidTestCase
import android.view.View
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertEquals
import butterknife.test.R

public class ViewTest : AndroidTestCase() {
  public fun testCast() {
    class Example(context: Context) : FrameLayout(context) {
      val name : TextView by bindView(1)
    }

    val example = Example(context)
    example.addView(textViewWithId(1))
    assertNotNull(example.name)
  }

  public fun testFindCached() {
    class Example(context: Context) : FrameLayout(context) {
      val name : View by bindView(1)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    assertNotNull(example.name)
    example.removeAllViews()
    assertNotNull(example.name)
  }

  public fun testOptional() {
    class Example(context: Context) : FrameLayout(context) {
      val present: View? by bindOptionalView(1)
      val missing: View? by bindOptionalView(2)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    assertNotNull(example.present)
    assertNull(example.missing)
  }

  public fun testOptionalCached() {
    class Example(context: Context) : FrameLayout(context) {
      val present: View? by bindOptionalView(1)
      val missing: View? by bindOptionalView(2)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    assertNotNull(example.present)
    assertNull(example.missing)
    example.removeAllViews()
    example.addView(viewWithId(2))
    assertNotNull(example.present)
    assertNull(example.missing)
  }

  public fun testMissingFails() {
    class Example(context: Context) : FrameLayout(context) {
      val name : TextView? by bindView(1)
    }

    val example = Example(context)
    try {
      example.name
    } catch (e: IllegalStateException) {
      assertEquals("View ID 1 for 'name' not found.", e.message)
    }
  }

  public fun testList() {
    class Example(context: Context) : FrameLayout(context) {
      val name : List<TextView> by bindViews(1, 2, 3)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    example.addView(viewWithId(2))
    example.addView(viewWithId(3))
    assertNotNull(example.name)
    assertEquals(3, example.name.count())
  }

  public fun testListCaches() {
    class Example(context: Context) : FrameLayout(context) {
      val name : List<TextView> by bindViews(1, 2, 3)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    example.addView(viewWithId(2))
    example.addView(viewWithId(3))
    assertNotNull(example.name)
    assertEquals(3, example.name.count())
    example.removeAllViews()
    assertNotNull(example.name)
    assertEquals(3, example.name.count())
  }

  public fun testListMissingFails() {
    class Example(context: Context) : FrameLayout(context) {
      val name : List<TextView> by bindViews(1, 2, 3)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    example.addView(viewWithId(3))
    try {
      example.name
    } catch (e: IllegalStateException) {
      assertEquals("View ID 2 for 'name' not found.", e.message)
    }
  }

  public fun testOptionalList() {
    class Example(context: Context) : FrameLayout(context) {
      val name : List<TextView> by bindOptionalViews(1, 2, 3)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    example.addView(viewWithId(3))
    assertNotNull(example.name)
    assertEquals(2, example.name.count())
  }

  public fun testOptionalListCaches() {
    class Example(context: Context) : FrameLayout(context) {
      val name : List<TextView> by bindOptionalViews(1, 2, 3)
    }

    val example = Example(context)
    example.addView(viewWithId(1))
    example.addView(viewWithId(3))
    assertNotNull(example.name)
    assertEquals(2, example.name.count())
    example.removeAllViews()
    assertNotNull(example.name)
    assertEquals(2, example.name.count())
  }

  public fun testColor() {
    class Example(context: Context) : FrameLayout(context) {
      val color : Int by bindColor(R.color.testColor)
    }

    var example = Example(context)
    assertEquals(0x0000beef, example.color)
  }

  public fun testInt() {
    class Example(context: Context) : FrameLayout(context) {
      val n : Int by bindInt(R.integer.testInt)
    }

    var example = Example(context)
    assertEquals(123456, example.n)
  }

  public fun testDimen() {
    class Example(context: Context) : FrameLayout(context) {
      val n : Float by bindDimen(R.dimen.testDimen)
    }

    // tests run on android devices, so we need the device density to ensure that the value is
    // correctly read from resources
    var density = context.resources.displayMetrics.density

    var example = Example(context)
    assertEquals(10 * density, example.n)
  }

  public fun testString() {
    class Example(context: Context) : FrameLayout(context) {
      val str : String by bindString(R.string.testString)
    }

    var example = Example(context)
    assertEquals("KotterKnife", example.str)
  }

  public fun testBool() {
    class Example(context: Context) : FrameLayout(context) {
      val b : Boolean by bindBool(R.bool.testBool)
    }

    var example = Example(context)
    assertEquals(true, example.b)
  }

  private fun viewWithId(id: Int) : View {
    val view = View(context)
    view.id = id
    return view
  }

  private fun textViewWithId(id: Int) : View {
    val view = TextView(context)
    view.id = id
    return view
  }
}
