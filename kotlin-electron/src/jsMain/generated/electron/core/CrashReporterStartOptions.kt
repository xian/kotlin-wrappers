package electron.core


external interface CrashReporterStartOptions {
    /**
     * URL that crash reports will be sent to as POST. Required unless `uploadToServer`
     * is `false`.
     */
    var submitURL: String?

    /**
     * Defaults to `app.name`.
     */
    var productName: String?

    /**
     * Deprecated alias for `{ globalExtra: { _companyName: ... } }`.
     *
     * @deprecated
     */
    var companyName: String?

    /**
     * Whether crash reports should be sent to the server. If false, crash reports will
     * be collected and stored in the crashes directory, but not uploaded. Default is
     * `true`.
     */
    var uploadToServer: Boolean?

    /**
     * If true, crashes generated in the main process will not be forwarded to the
     * system crash handler. Default is `false`.
     */
    var ignoreSystemCrashHandler: Boolean?

    /**
     * If true, limit the number of crashes uploaded to 1/hour. Default is `false`.
     *
     * @platform darwin,win32
     */
    var rateLimit: Boolean?

    /**
     * If true, crash reports will be compressed and uploaded with `Content-Encoding:
     * gzip`. Default is `true`.
     */
    var compress: Boolean?

    /**
     * Extra string key/value annotations that will be sent along with crash reports
     * that are generated in the main process. Only string values are supported.
     * Crashes generated in child processes will not contain these extra parameters to
     * crash reports generated from child processes, call `addExtraParameter` from the
     * child process.
     */
    var extra: js.core.ReadonlyRecord<String, String>?

    /**
     * Extra string key/value annotations that will be sent along with any crash
     * reports generated in any process. These annotations cannot be changed once the
     * crash reporter has been started. If a key is present in both the global extra
     * parameters and the process-specific extra parameters, then the global one will
     * take precedence. By default, `productName` and the app version are included, as
     * well as the Electron version.
     */
    var globalExtra: js.core.ReadonlyRecord<String, String>?
}
