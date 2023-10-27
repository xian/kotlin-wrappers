@file:JsModule("node:child_process")

package node.childProcess

import js.core.ReadonlyArray

/**
 * The `child_process.execFile()` function is similar to {@link exec} except that it does not spawn a shell by default. Rather, the specified
 * executable `file` is spawned directly as a new process making it slightly more
 * efficient than {@link exec}.
 *
 * The same options as {@link exec} are supported. Since a shell is
 * not spawned, behaviors such as I/O redirection and file globbing are not
 * supported.
 *
 * ```js
 * const { execFile } = require('child_process');
 * const child = execFile('node', ['--version'], (error, stdout, stderr) => {
 *   if (error) {
 *     throw error;
 *   }
 *   console.log(stdout);
 * });
 * ```
 *
 * The `stdout` and `stderr` arguments passed to the callback will contain the
 * stdout and stderr output of the child process. By default, Node.js will decode
 * the output as UTF-8 and pass strings to the callback. The `encoding` option
 * can be used to specify the character encoding used to decode the stdout and
 * stderr output. If `encoding` is `'buffer'`, or an unrecognized character
 * encoding, `Buffer` objects will be passed to the callback instead.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a `Promise` for an `Object` with `stdout` and `stderr` properties. The returned`ChildProcess` instance is attached to the `Promise` as a `child` property. In
 * case of an error (including any error resulting in an exit code other than 0), a
 * rejected promise is returned, with the same `error` object given in the
 * callback, but with two additional properties `stdout` and `stderr`.
 *
 * ```js
 * const util = require('util');
 * const execFile = util.promisify(require('child_process').execFile);
 * async function getVersion() {
 *   const { stdout } = await execFile('node', ['--version']);
 *   console.log(stdout);
 * }
 * getVersion();
 * ```
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 *
 * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
 * the error passed to the callback will be an `AbortError`:
 *
 * ```js
 * const { execFile } = require('child_process');
 * const controller = new AbortController();
 * const { signal } = controller;
 * const child = execFile('node', ['--version'], { signal }, (error) => {
 *   console.log(error); // an AbortError
 * });
 * controller.abort();
 * ```
 * @since v0.1.91
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @param callback Called with the output when process terminates.
 */
external fun execFile(file: String): ChildProcess

external fun execFile(file: String, options: (ExecFileObjectEncodingOptions)?): ChildProcess

external fun execFile(file: String, args: ReadonlyArray<String>? = definedExternally): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: (ExecFileObjectEncodingOptions)?,
): ChildProcess

// no `options` definitely means stdout/stderr are `string`.
external fun execFile(
    file: String,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

// `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
external fun execFile(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: (error: ExecFileException?, stdout: node.buffer.Buffer, stderr: node.buffer.Buffer) -> Unit,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: ExecFileOptionsWithBufferEncoding,
    callback: (error: ExecFileException?, stdout: node.buffer.Buffer, stderr: node.buffer.Buffer) -> Unit,
): ChildProcess

// `options` with well known `encoding` means stdout/stderr are definitely `string`.
external fun execFile(
    file: String,
    options: ExecFileOptionsWithStringEncoding,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: ExecFileOptionsWithStringEncoding,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

// `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
// There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
external fun execFile(
    file: String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: (error: ExecFileException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: ExecFileOptionsWithOtherEncoding,
    callback: (error: ExecFileException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit,
): ChildProcess

// `options` without an `encoding` means stdout/stderr are definitely `string`.
external fun execFile(
    file: String,
    options: ExecFileOptions,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: ExecFileOptions,
    callback: (error: ExecFileException?, stdout: String, stderr: String) -> Unit,
): ChildProcess

// fallback if nothing else matches. Worst case is always `string | Buffer`.
external fun execFile(
    file: String,
    options: (ExecFileObjectEncodingOptions)?,
    callback: ((error: ExecFileException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit)?,
): ChildProcess

external fun execFile(
    file: String,
    args: ReadonlyArray<String>?,
    options: (ExecFileObjectEncodingOptions)?,
    callback: ((error: ExecFileException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit)?,
): ChildProcess
