import kotlin.test.Test
import kotlin.test.assertContains

val Object = js("Object")

internal class ModelIntrospectionTest {
    @Test
    fun test0() {
        val m1 = Model1("m1", "c1")
        val m1Prototype = m1::class.js.asDynamic().prototype

        val ownPropertyNames = Object.getOwnPropertyNames(m1)
            .unsafeCast<Array<String>>()
            .filter { true }

        val prototypePropertyNames = Object.getOwnPropertyNames(m1Prototype)
            .unsafeCast<Array<String>>()
            .filter { property -> Object.getOwnPropertyDescriptor(m1Prototype, property).get !== undefined }

        println("ownPropertyNames: $ownPropertyNames")
        println("prototypePropertyNames with get(): $prototypePropertyNames")

        assertContains(ownPropertyNames, "p1")
    }
}