// Generated by Karakum - do not modify it manually!

package node.wasi


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WASIOptionsVersion {
    companion object {
        @seskar.js.JsValue("unstable")
        val unstable: WASIOptionsVersion

        @seskar.js.JsValue("preview1")
        val preview1: WASIOptionsVersion
    }
}
