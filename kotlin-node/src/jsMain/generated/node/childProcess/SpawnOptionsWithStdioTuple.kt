package node.childProcess


sealed external interface SpawnOptionsWithStdioTuple<Stdin : Any? /* StdioNull | StdioPipe */, Stdout : Any? /* StdioNull | StdioPipe */, Stderr : Any? /* StdioNull | StdioPipe */> :
    SpawnOptions {
    @JsName("stdio")
    var stdioTuple: js.core.JsTuple3<Stdin, Stdout, Stderr>
}
