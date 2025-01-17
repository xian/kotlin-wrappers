@file:JsModule("@remix-run/router")

package remix.run.router

/**
 * Memory history stores the current location in memory. It is designed for use
 * in stateful non-browser environments like tests and React Native.
 */
external fun createMemoryHistory(options: MemoryHistoryOptions = definedExternally): MemoryHistory
