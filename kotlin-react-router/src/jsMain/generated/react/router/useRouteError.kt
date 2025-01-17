@file:JsModule("react-router")

package react.router


/**
 * Returns the nearest ancestor Route error, which could be a loader/action
 * error or a render error.  This is intended to be called from your
 * ErrorBoundary/errorElement to display a proper error message.
 */
external fun useRouteError(): Any?
