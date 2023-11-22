// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto


/**
 * The `ECDH` class is a utility for creating Elliptic Curve Diffie-Hellman (ECDH)
 * key exchanges.
 *
 * Instances of the `ECDH` class can be created using the {@link createECDH} function.
 *
 * ```js
 * import assert from 'assert';
 *
 * const {
 *   createECDH
 * } = await import('crypto');
 *
 * // Generate Alice's keys...
 * const alice = createECDH('secp521r1');
 * const aliceKey = alice.generateKeys();
 *
 * // Generate Bob's keys...
 * const bob = createECDH('secp521r1');
 * const bobKey = bob.generateKeys();
 *
 * // Exchange and generate the secret...
 * const aliceSecret = alice.computeSecret(bobKey);
 * const bobSecret = bob.computeSecret(aliceKey);
 *
 * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
 * // OK
 * ```
 * @since v0.11.14
 */

external class ECDH {
    /**
     * Generates private and public EC Diffie-Hellman key values, and returns
     * the public key in the specified `format` and `encoding`. This key should be
     * transferred to the other party.
     *
     * The `format` argument specifies point encoding and can be `'compressed'` or`'uncompressed'`. If `format` is not specified, the point will be returned in`'uncompressed'` format.
     *
     * If `encoding` is provided a string is returned; otherwise a `Buffer` is returned.
     * @since v0.11.14
     * @param encoding The `encoding` of the return value.
     * @param [format='uncompressed']
     */
    fun generateKeys(): node.buffer.Buffer
    fun generateKeys(encoding: BinaryToTextEncoding, format: ECDHKeyFormat = definedExternally): String

    /**
     * Computes the shared secret using `otherPublicKey` as the other
     * party's public key and returns the computed shared secret. The supplied
     * key is interpreted using specified `inputEncoding`, and the returned secret
     * is encoded using the specified `outputEncoding`.
     * If the `inputEncoding` is not
     * provided, `otherPublicKey` is expected to be a `Buffer`, `TypedArray`, or`DataView`.
     *
     * If `outputEncoding` is given a string will be returned; otherwise a `Buffer` is returned.
     *
     * `ecdh.computeSecret` will throw an`ERR_CRYPTO_ECDH_INVALID_PUBLIC_KEY` error when `otherPublicKey`lies outside of the elliptic curve. Since `otherPublicKey` is
     * usually supplied from a remote user over an insecure network,
     * be sure to handle this exception accordingly.
     * @since v0.11.14
     * @param inputEncoding The `encoding` of the `otherPublicKey` string.
     * @param outputEncoding The `encoding` of the return value.
     */
    fun computeSecret(otherPublicKey: js.buffer.ArrayBufferView): node.buffer.Buffer
    fun computeSecret(otherPublicKey: js.buffer.ArrayBufferView, outputEncoding: BinaryToTextEncoding): String
    fun computeSecret(otherPublicKey: String, inputEncoding: BinaryToTextEncoding): node.buffer.Buffer
    fun computeSecret(
        otherPublicKey: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: BinaryToTextEncoding,
    ): String

    /**
     * If `encoding` is specified, a string is returned; otherwise a `Buffer` is
     * returned.
     * @since v0.11.14
     * @param encoding The `encoding` of the return value.
     * @return The EC Diffie-Hellman in the specified `encoding`.
     */
    fun getPrivateKey(): node.buffer.Buffer
    fun getPrivateKey(encoding: BinaryToTextEncoding): String

    /**
     * The `format` argument specifies point encoding and can be `'compressed'` or`'uncompressed'`. If `format` is not specified the point will be returned in`'uncompressed'` format.
     *
     * If `encoding` is specified, a string is returned; otherwise a `Buffer` is
     * returned.
     * @since v0.11.14
     * @param [encoding] The `encoding` of the return value.
     * @param [format='uncompressed']
     * @return The EC Diffie-Hellman public key in the specified `encoding` and `format`.
     */
    fun getPublicKey(
        encoding: Nothing? = definedExternally,
        format: ECDHKeyFormat = definedExternally,
    ): node.buffer.Buffer

    fun getPublicKey(encoding: BinaryToTextEncoding, format: ECDHKeyFormat = definedExternally): String

    /**
     * Sets the EC Diffie-Hellman private key.
     * If `encoding` is provided, `privateKey` is expected
     * to be a string; otherwise `privateKey` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
     *
     * If `privateKey` is not valid for the curve specified when the `ECDH` object was
     * created, an error is thrown. Upon setting the private key, the associated
     * public point (key) is also generated and set in the `ECDH` object.
     * @since v0.11.14
     * @param encoding The `encoding` of the `privateKey` string.
     */
    fun setPrivateKey(privateKey: js.buffer.ArrayBufferView): Unit
    fun setPrivateKey(privateKey: String, encoding: BinaryToTextEncoding): Unit

    companion object {
        /**
         * Converts the EC Diffie-Hellman public key specified by `key` and `curve` to the
         * format specified by `format`. The `format` argument specifies point encoding
         * and can be `'compressed'`, `'uncompressed'` or `'hybrid'`. The supplied key is
         * interpreted using the specified `inputEncoding`, and the returned key is encoded
         * using the specified `outputEncoding`.
         *
         * Use {@link getCurves} to obtain a list of available curve names.
         * On recent OpenSSL releases, `openssl ecparam -list_curves` will also display
         * the name and description of each available elliptic curve.
         *
         * If `format` is not specified the point will be returned in `'uncompressed'`format.
         *
         * If the `inputEncoding` is not provided, `key` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
         *
         * Example (uncompressing a key):
         *
         * ```js
         * const {
         *   createECDH,
         *   ECDH
         * } = await import('crypto');
         *
         * const ecdh = createECDH('secp256k1');
         * ecdh.generateKeys();
         *
         * const compressedKey = ecdh.getPublicKey('hex', 'compressed');
         *
         * const uncompressedKey = ECDH.convertKey(compressedKey,
         *                                         'secp256k1',
         *                                         'hex',
         *                                         'hex',
         *                                         'uncompressed');
         *
         * // The converted key and the uncompressed public key should be the same
         * console.log(uncompressedKey === ecdh.getPublicKey('hex'));
         * ```
         * @since v10.0.0
         * @param inputEncoding The `encoding` of the `key` string.
         * @param outputEncoding The `encoding` of the return value.
         * @param [format='uncompressed']
         */
        fun convertKey(
            key: BinaryLike,
            curve: String,
            inputEncoding: BinaryToTextEncoding = definedExternally,
            outputEncoding: ECDHConvertKeyOutputEncoding = definedExternally,
            format: ECDHConvertKeyFormat = definedExternally,
        ): Any /* Buffer | string */
    }

}
