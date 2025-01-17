@file:JsModule("react-router")

package react.router

import remix.run.router.Action as NavigationType

/**
 * Returns the current navigation action which describes how the router came to
 * the current location, either by a pop, push, or replace on the history stack.
 *
 * @see https://reactrouter.com/hooks/use-navigation-type
 */
external fun useNavigationType(): NavigationType
