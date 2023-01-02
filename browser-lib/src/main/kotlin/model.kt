@file:OptIn(ExperimentalJsExport::class)

@JsExport
interface Contract1 {
    val c1: String
}

@JsExport
class Model1(
    val p1: String,
    override val c1: String,
) : Contract1
