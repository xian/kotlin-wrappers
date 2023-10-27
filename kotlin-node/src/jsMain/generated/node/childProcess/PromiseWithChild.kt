package node.childProcess

import js.promise.Promise


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface PromiseWithChild<T> : Promise<T> {
    var child: ChildProcess
}
