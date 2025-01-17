@file:JsModule("node:dns")

package node.dns


/**
 * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
 * array of host names.
 *
 * On error, `err` is an `Error` object, where `err.code` is
 * one of the `DNS error codes`.
 * @since v0.1.16
 */
external fun reverse(ip: String, callback: (err: node.ErrnoException?, hostnames: js.core.ReadonlyArray<String>) -> Unit): Unit
