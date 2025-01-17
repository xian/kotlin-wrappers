@file:JsModule("react-router")

package react.router


/**
 * Returns a revalidate function for manually triggering revalidation, as well
 * as the current state of any manual revalidations
 */
external fun useRevalidator(): UseRevalidatorResult
