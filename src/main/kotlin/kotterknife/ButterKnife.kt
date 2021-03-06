package kotterknife

import android.app.Activity
import android.app.Dialog
import android.app.DialogFragment
import android.app.Fragment
import android.content.Context
import android.content.res.Resources
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import android.support.v4.app.DialogFragment as SupportDialogFragment
import android.support.v4.app.Fragment as SupportFragment

public fun <V : View> View.bindView(id: Int)
    : ReadOnlyProperty<View, V> = required(id, viewFinder)
public fun <V : View> Activity.bindView(id: Int)
    : ReadOnlyProperty<Activity, V> = required(id, viewFinder)
public fun <V : View> Dialog.bindView(id: Int)
    : ReadOnlyProperty<Dialog, V> = required(id, viewFinder)
public fun <V : View> DialogFragment.bindView(id: Int)
    : ReadOnlyProperty<DialogFragment, V> = required(id, viewFinder)
public fun <V : View> SupportDialogFragment.bindView(id: Int)
    : ReadOnlyProperty<SupportDialogFragment, V> = required(id, viewFinder)
public fun <V : View> Fragment.bindView(id: Int)
    : ReadOnlyProperty<Fragment, V> = required(id, viewFinder)
public fun <V : View> SupportFragment.bindView(id: Int)
    : ReadOnlyProperty<SupportFragment, V> = required(id, viewFinder)
public fun <V : View> ViewHolder.bindView(id: Int)
    : ReadOnlyProperty<ViewHolder, V> = required(id, viewFinder)

public fun <V : View> View.bindOptionalView(id: Int)
    : ReadOnlyProperty<View, V?> = optional(id, viewFinder)
public fun <V : View> Activity.bindOptionalView(id: Int)
    : ReadOnlyProperty<Activity, V?> = optional(id, viewFinder)
public fun <V : View> Dialog.bindOptionalView(id: Int)
    : ReadOnlyProperty<Dialog, V?> = optional(id, viewFinder)
public fun <V : View> DialogFragment.bindOptionalView(id: Int)
    : ReadOnlyProperty<DialogFragment, V?> = optional(id, viewFinder)
public fun <V : View> SupportDialogFragment.bindOptionalView(id: Int)
    : ReadOnlyProperty<SupportDialogFragment, V?> = optional(id, viewFinder)
public fun <V : View> Fragment.bindOptionalView(id: Int)
    : ReadOnlyProperty<Fragment, V?> = optional(id, viewFinder)
public fun <V : View> SupportFragment.bindOptionalView(id: Int)
    : ReadOnlyProperty<SupportFragment, V?> = optional(id, viewFinder)
public fun <V : View> ViewHolder.bindOptionalView(id: Int)
    : ReadOnlyProperty<ViewHolder, V?> = optional(id, viewFinder)

public fun <V : View> View.bindViews(vararg ids: Int)
    : ReadOnlyProperty<View, List<V>> = required(ids, viewFinder)
public fun <V : View> Activity.bindViews(vararg ids: Int)
    : ReadOnlyProperty<Activity, List<V>> = required(ids, viewFinder)
public fun <V : View> Dialog.bindViews(vararg ids: Int)
    : ReadOnlyProperty<Dialog, List<V>> = required(ids, viewFinder)
public fun <V : View> DialogFragment.bindViews(vararg ids: Int)
    : ReadOnlyProperty<DialogFragment, List<V>> = required(ids, viewFinder)
public fun <V : View> SupportDialogFragment.bindViews(vararg ids: Int)
    : ReadOnlyProperty<SupportDialogFragment, List<V>> = required(ids, viewFinder)
public fun <V : View> Fragment.bindViews(vararg ids: Int)
    : ReadOnlyProperty<Fragment, List<V>> = required(ids, viewFinder)
public fun <V : View> SupportFragment.bindViews(vararg ids: Int)
    : ReadOnlyProperty<SupportFragment, List<V>> = required(ids, viewFinder)
public fun <V : View> ViewHolder.bindViews(vararg ids: Int)
    : ReadOnlyProperty<ViewHolder, List<V>> = required(ids, viewFinder)

public fun <V : View> View.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<View, List<V>> = optional(ids, viewFinder)
public fun <V : View> Activity.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<Activity, List<V>> = optional(ids, viewFinder)
public fun <V : View> Dialog.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<Dialog, List<V>> = optional(ids, viewFinder)
public fun <V : View> DialogFragment.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<DialogFragment, List<V>> = optional(ids, viewFinder)
public fun <V : View> SupportDialogFragment.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<SupportDialogFragment, List<V>> = optional(ids, viewFinder)
public fun <V : View> Fragment.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<Fragment, List<V>> = optional(ids, viewFinder)
public fun <V : View> SupportFragment.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<SupportFragment, List<V>> = optional(ids, viewFinder)
public fun <V : View> ViewHolder.bindOptionalViews(vararg ids: Int)
    : ReadOnlyProperty<ViewHolder, List<V>> = optional(ids, viewFinder)

public fun View.bindColor(id: Int)
    : ReadOnlyProperty<View, Int> = requiredColor(context, id, colorFinder)
public fun Activity.bindColor(id: Int)
    : ReadOnlyProperty<Activity, Int> = requiredColor(this, id, colorFinder)
public fun Dialog.bindColor(id: Int)
    : ReadOnlyProperty<Dialog, Int> = requiredColor(context, id, colorFinder)
public fun Fragment.bindColor(id: Int)
    : ReadOnlyProperty<Fragment, Int> = requiredColor(context, id, colorFinder)
public fun SupportFragment.bindColor(id: Int)
    : ReadOnlyProperty<SupportFragment, Int> = requiredColor(context, id, colorFinder)
public fun ViewHolder.bindColor(id: Int)
    : ReadOnlyProperty<ViewHolder, Int> = requiredColor(itemView.context, id, colorFinder)

public fun View.bindInt(id: Int)
        : ReadOnlyProperty<View, Int> = requiredInt(context, id, intFinder)
public fun Activity.bindInt(id: Int)
        : ReadOnlyProperty<Activity, Int> = requiredInt(this, id, intFinder)
public fun Dialog.bindInt(id: Int)
        : ReadOnlyProperty<Dialog, Int> = requiredInt(context, id, intFinder)
public fun Fragment.bindInt(id: Int)
        : ReadOnlyProperty<Fragment, Int> = requiredInt(context, id, intFinder)
public fun SupportFragment.bindInt(id: Int)
        : ReadOnlyProperty<SupportFragment, Int> = requiredInt(context, id, intFinder)
public fun ViewHolder.bindInt(id: Int)
        : ReadOnlyProperty<ViewHolder, Int> = requiredInt(itemView.context, id, intFinder)

public fun View.bindDimen(id: Int)
        : ReadOnlyProperty<View, Float> = requiredDimen(context, id, dimenFinder)
public fun Activity.bindDimen(id: Int)
        : ReadOnlyProperty<Activity, Float> = requiredDimen(this, id, dimenFinder)
public fun Dialog.bindDimen(id: Int)
        : ReadOnlyProperty<Dialog, Float> = requiredDimen(context, id, dimenFinder)
public fun Fragment.bindDimen(id: Int)
        : ReadOnlyProperty<Fragment, Float> = requiredDimen(context, id, dimenFinder)
public fun SupportFragment.bindDimen(id: Int)
        : ReadOnlyProperty<SupportFragment, Float> = requiredDimen(context, id, dimenFinder)
public fun ViewHolder.bindDimen(id: Int)
        : ReadOnlyProperty<ViewHolder, Float> = requiredDimen(itemView.context, id, dimenFinder)

public fun View.bindString(id: Int)
        : ReadOnlyProperty<View, String> = requiredString(context, id, stringFinder)
public fun Activity.bindString(id: Int)
        : ReadOnlyProperty<Activity, String> = requiredString(this, id, stringFinder)
public fun Dialog.bindString(id: Int)
        : ReadOnlyProperty<Dialog, String> = requiredString(context, id, stringFinder)
public fun Fragment.bindString(id: Int)
        : ReadOnlyProperty<Fragment, String> = requiredString(context, id, stringFinder)
public fun SupportFragment.bindString(id: Int)
        : ReadOnlyProperty<SupportFragment, String> = requiredString(context, id, stringFinder)
public fun ViewHolder.bindString(id: Int)
        : ReadOnlyProperty<ViewHolder, String> = requiredString(itemView.context, id, stringFinder)

public fun View.bindBool(id: Int)
        : ReadOnlyProperty<View, Boolean> = requiredBool(context, id, boolFinder)
public fun Activity.bindBool(id: Int)
        : ReadOnlyProperty<Activity, Boolean> = requiredBool(this, id, boolFinder)
public fun Dialog.bindBool(id: Int)
        : ReadOnlyProperty<Dialog, Boolean> = requiredBool(context, id, boolFinder)
public fun Fragment.bindBool(id: Int)
        : ReadOnlyProperty<Fragment, Boolean> = requiredBool(context, id, boolFinder)
public fun SupportFragment.bindBool(id: Int)
        : ReadOnlyProperty<SupportFragment, Boolean> = requiredBool(context, id, boolFinder)
public fun ViewHolder.bindBool(id: Int)
        : ReadOnlyProperty<ViewHolder, Boolean> = requiredBool(itemView.context, id, boolFinder)

private val View.viewFinder: View.(Int) -> View?
    get() = { findViewById(it) }
private val Activity.viewFinder: Activity.(Int) -> View?
    get() = { findViewById(it) }
private val Dialog.viewFinder: Dialog.(Int) -> View?
    get() = { findViewById(it) }
private val DialogFragment.viewFinder: DialogFragment.(Int) -> View?
    get() = { dialog?.findViewById(it) ?: view?.findViewById(it) }
private val SupportDialogFragment.viewFinder: SupportDialogFragment.(Int) -> View?
    get() = { dialog?.findViewById(it) ?: view?.findViewById(it) }
private val Fragment.viewFinder: Fragment.(Int) -> View?
    get() = { view.findViewById(it) }
private val SupportFragment.viewFinder: SupportFragment.(Int) -> View?
    get() = { view!!.findViewById(it) }
private val ViewHolder.viewFinder: ViewHolder.(Int) -> View?
    get() = { itemView.findViewById(it) }

private val View.colorFinder: Context.(Int) -> Int?
    get() = { resources.getColor(it, theme) }
private val Activity.colorFinder: Context.(Int) -> Int?
    get() = { resources.getColor(it, theme) }
private val Dialog.colorFinder: Context.(Int) -> Int?
    get() = { resources.getColor(it, theme) }
private val Fragment.colorFinder: Context.(Int) -> Int?
    get() = { resources.getColor(it, theme) }
private val SupportFragment.colorFinder: Context.(Int) -> Int?
    get() = { resources.getColor(it) }
private val ViewHolder.colorFinder: Context.(Int) -> Int?
    get() = { itemView.context.resources.getColor(it) }

private val View.intFinder: Context.(Int) -> Int?
    get() = { resources.getInteger(it) }
private val Activity.intFinder: Context.(Int) -> Int?
    get() = { resources.getInteger(it) }
private val Dialog.intFinder: Context.(Int) -> Int?
    get() = { resources.getInteger(it) }
private val Fragment.intFinder: Context.(Int) -> Int?
    get() = { resources.getInteger(it) }
private val SupportFragment.intFinder: Context.(Int) -> Int?
    get() = { resources.getInteger(it) }
private val ViewHolder.intFinder: Context.(Int) -> Int?
    get() = { itemView.context.resources.getInteger(it) }

private val View.dimenFinder: Context.(Int) -> Float?
    get() = { resources.getDimension(it) }
private val Activity.dimenFinder: Context.(Int) -> Float?
    get() = { resources.getDimension(it) }
private val Dialog.dimenFinder: Context.(Int) -> Float?
    get() = { resources.getDimension(it) }
private val Fragment.dimenFinder: Context.(Int) -> Float?
    get() = { resources.getDimension(it) }
private val SupportFragment.dimenFinder: Context.(Int) -> Float?
    get() = { resources.getDimension(it) }
private val ViewHolder.dimenFinder: Context.(Int) -> Float?
    get() = { itemView.context.resources.getDimension(it) }

private val View.stringFinder: Context.(Int) -> String?
    get() = { resources.getString(it) }
private val Activity.stringFinder: Context.(Int) -> String?
    get() = { resources.getString(it) }
private val Dialog.stringFinder: Context.(Int) -> String?
    get() = { resources.getString(it) }
private val Fragment.stringFinder: Context.(Int) -> String?
    get() = { resources.getString(it) }
private val SupportFragment.stringFinder: Context.(Int) -> String?
    get() = { resources.getString(it) }
private val ViewHolder.stringFinder: Context.(Int) -> String?
    get() = { itemView.context.resources.getString(it) }

private val View.boolFinder: Context.(Int) -> Boolean?
    get() = { resources.getBoolean(it) }
private val Activity.boolFinder: Context.(Int) -> Boolean?
    get() = { resources.getBoolean(it) }
private val Dialog.boolFinder: Context.(Int) -> Boolean?
    get() = { resources.getBoolean(it) }
private val Fragment.boolFinder: Context.(Int) -> Boolean?
    get() = { resources.getBoolean(it) }
private val SupportFragment.boolFinder: Context.(Int) -> Boolean?
    get() = { resources.getBoolean(it) }
private val ViewHolder.boolFinder: Context.(Int) -> Boolean?
    get() = { itemView.context.resources.getBoolean(it) }

private fun viewNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("View", id, desc)
private fun colorNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("Color", id, desc)
private fun intNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("Integer", id, desc)
private fun dimenNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("Dimen", id, desc)
private fun stringNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("String", id, desc)
private fun boolNotFound(id:Int, desc: KProperty<*>): Nothing =
    notFound("Boolean", id, desc)
private fun notFound(type:String, id:Int, desc: KProperty<*>): Nothing =
    throw IllegalStateException("$type ID $id for '${desc.name}' not found.")

@Suppress("UNCHECKED_CAST")
private fun <T, V : View> required(id: Int, finder: T.(Int) -> View?)
    = Lazy { t: T, desc -> t.finder(id) as V? ?: viewNotFound(id, desc) }

@Suppress("UNCHECKED_CAST")
private fun <T, V : View> optional(id: Int, finder: T.(Int) -> View?)
    = Lazy { t: T, desc ->  t.finder(id) as V? }

@Suppress("UNCHECKED_CAST")
private fun <T, V : View> required(ids: IntArray, finder: T.(Int) -> View?)
    = Lazy { t: T, desc -> ids.map { t.finder(it) as V? ?: viewNotFound(it, desc) } }

@Suppress("UNCHECKED_CAST")
private fun <T, V : View> optional(ids: IntArray, finder: T.(Int) -> View?)
    = Lazy { t: T, desc -> ids.map { t.finder(it) as V? }.filterNotNull() }

private fun <T> requiredColor(context: Context, id: Int, finder: (Context, Int) -> Int?)
    = Lazy { t: T, desc -> finder(context, id) ?: colorNotFound(id, desc) }

private fun <T> requiredInt(context: Context, id: Int, finder: (Context, Int) -> Int?)
    = Lazy { t: T, desc -> finder(context, id) ?: intNotFound(id, desc) }

private fun <T> requiredDimen(context: Context, id: Int, finder: (Context, Int) -> Float?)
    = Lazy { t: T, desc -> finder(context, id) ?: dimenNotFound(id, desc) }

private fun <T> requiredString(context: Context, id: Int, finder: (Context, Int) -> String?)
    = Lazy { t: T, desc -> finder(context, id) ?: stringNotFound(id, desc) }

private fun <T> requiredBool(context: Context, id: Int, finder: (Context, Int) -> Boolean?)
    = Lazy { t: T, desc -> finder(context, id) ?: boolNotFound(id, desc) }

// Like Kotlin's lazy delegate but the initializer gets the target and metadata passed to it
private class Lazy<T, V>(private val initializer: (T, KProperty<*>) -> V) : ReadOnlyProperty<T, V> {
  private object EMPTY
  private var value: Any? = EMPTY

  override fun getValue(thisRef: T, property: KProperty<*>): V {
    if (value == EMPTY) {
      value = initializer(thisRef, property)
    }
    @Suppress("UNCHECKED_CAST")
    return value as V
  }
}
