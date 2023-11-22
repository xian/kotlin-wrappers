// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto


/**
 * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
 * key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPublicKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * The `signature` argument is the previously calculated signature for the `data`.
 *
 * Because public keys can be derived from private keys, a private key or a public
 * key may be passed for `key`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: KeyLike,
    signature: js.buffer.ArrayBufferView,
): Boolean

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: js.buffer.ArrayBufferView,
): Boolean

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: js.buffer.ArrayBufferView,
): Boolean

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyJsonWebKeyInput,
    signature: js.buffer.ArrayBufferView,
): Boolean

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: KeyLike,
    signature: js.buffer.ArrayBufferView,
    callback: (error: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: js.buffer.ArrayBufferView,
    callback: (error: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: js.buffer.ArrayBufferView,
    callback: (error: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit

external fun verify(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: VerifyJsonWebKeyInput,
    signature: js.buffer.ArrayBufferView,
    callback: (error: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit
