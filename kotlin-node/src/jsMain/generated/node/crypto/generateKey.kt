@file:JsModule("node:crypto")

package node.crypto


/**
 * Asynchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
 *
 * ```js
 * const {
 *   generateKey
 * } = await import('crypto');
 *
 * generateKey('hmac', { length: 64 }, (err, key) => {
 *   if (err) throw err;
 *   console.log(key.export().toString('hex'));  // 46e..........620
 * });
 * ```
 * @since v15.0.0
 * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
 */
external fun generateKey(
    type: GenerateKeyType,
    options: GenerateKeyOptions,
    callback: (err: Throwable /* JsError */?, key: KeyObject) -> Unit,
): Unit
