@file:JsModule("react-router")

package react.router


/**
 * Returns the element for the child route at this level of the route
 * hierarchy. Used internally by <Outlet> to render child routes.
 *
 * @see https://reactrouter.com/hooks/use-outlet
 */
external fun useOutlet(context: Any? = definedExternally): react.ReactElement<*>?
