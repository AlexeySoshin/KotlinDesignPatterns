/**
 * Using <code>by</code> keyword you can delegate all but overridden methods
 */
class HappyMap<K, V>(val map : MutableMap<K, V> = mutableMapOf<K, V>()) : MutableMap<K, V> by map{
    override fun put(key: K, value: V): V? {
        val res = map.put(key, value)

        if (res == null) {
            println("Yay! $key")
        }

        return res
    }
}