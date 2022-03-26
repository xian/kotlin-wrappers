// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createPalette")
@file:JsNonModule

package mui.material.styles

external interface CommonColors {
    var black: csstype.Color

    var white: csstype.Color
}

external interface TypeText {
    var primary: csstype.Color

    var secondary: csstype.Color

    var disabled: csstype.Color
}

external interface TypeAction {
    var active: csstype.Color

    var hover: csstype.Color

    var hoverOpacity: Number

    var selected: csstype.Color

    var selectedOpacity: Number

    var disabled: csstype.Color

    var disabledOpacity: Number

    var disabledBackground: csstype.Color

    var focus: csstype.Color

    var focusOpacity: Number

    var activatedOpacity: Number
}

external interface TypeBackground {
    var default: String

    var paper: String
}

external interface SimplePaletteColorOptions {
    var light: csstype.Color?

    var main: csstype.Color

    var dark: csstype.Color?

    var contrastText: csstype.Color?
}

external interface PaletteColor {
    var light: csstype.Color

    var main: csstype.Color

    var dark: csstype.Color

    var contrastText: csstype.Color
}

// This is related to PaletteMode, unclear how you access one from the other, though.
external interface TypeObject {
    var text: dynamic

    var action: dynamic

    var divider: dynamic

    var background: dynamic
}

external interface PaletteAugmentColorOptions {
    var color: csstype.Color

    var mainShade: dynamic

    var lightShade: dynamic

    var darkShade: dynamic

    var name: dynamic
}

enum class PaletteMode {
    light,
    dark
}

external interface Palette {
    var common: CommonColors

    // var mode: PaletteMode is declared as an extension var below.

    var contrastThreshold: Number

    var tonalOffset: Number

    var primary: PaletteColor

    var secondary: PaletteColor

    var error: PaletteColor

    var warning: PaletteColor

    var info: PaletteColor

    var success: PaletteColor

    var grey: dynamic

    var text: TypeText

    var divider: csstype.Color

    var action: TypeAction

    var background: TypeBackground

    var getContrastText: (background: String) -> String

    var augmentColor: (options: PaletteAugmentColorOptions) -> PaletteColor
}

var Palette.mode: PaletteType
    get() = PaletteType.valueOf(asDynamic()["mode"] as String)
    set(value) { asDynamic()["mode"] = value.name }

external interface PaletteOptions {
    var primary: dynamic

    var secondary: dynamic

    var error: dynamic

    var warning: dynamic

    var info: dynamic

    var success: dynamic

    var mode: dynamic

    var tonalOffset: dynamic

    var contrastThreshold: Number?

    var common: dynamic

    var grey: dynamic

    var text: dynamic

    var divider: String?

    var action: dynamic

    var background: dynamic

    var getContrastText: ((background: String) -> String)?
}

@JsName("default")
external fun createPalette(
    palette: PaletteOptions,
): Palette
