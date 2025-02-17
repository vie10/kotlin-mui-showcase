package team.karakum.component.showcase

import csstype.Display
import csstype.FlexWrap.Companion.wrap
import csstype.px
import mui.material.Box
import mui.material.Paper
import mui.material.PaperVariant
import mui.material.Typography
import mui.system.sx
import react.FC
import react.Props

val PaperShowcase = FC<Props> {
    Box {
        sx {
            display = Display.flex
            flexWrap = wrap
            width = 128.px
            height = 128.px
        }

        Paper {
            variant = PaperVariant.outlined

            Typography {
                +"Outlined Paper Component"
            }
        }
    }
}
