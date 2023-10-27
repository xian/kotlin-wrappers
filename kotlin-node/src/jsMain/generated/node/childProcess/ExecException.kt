package node.childProcess


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface ExecException : Throwable /* JsError */ {
    var cmd: String?
    var killed: Boolean?
    var code: Double?
    var signal: node.process.Signals?
}
