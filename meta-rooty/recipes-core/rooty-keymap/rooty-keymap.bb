inherit update-rc.d

LICENSE="CLOSED"

INITSCRIPT_NAME = "set-rooty-keymap.sh"
INITSCRIPT_PARAMS = "start 90 1 3 5 ."

do_install (){
    install -d ${D}/${sysconfdir}/init.d/
    # Fallback to Pixelbook custom keymap
    echo "" >> ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
    echo "loadkeys ${KMAP}" >> ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
    echo "setfont ${BLINDFONT}" >> ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
    chmod 755 ${D}/${sysconfdir}/init.d/${INITSCRIPT_NAME}
}

FILES_${PN} = "${sysconfdir}/init.d/set-rooty-keymap.sh"


KMAP ?= "${datadir}/keymaps/i386/qwertz/de-latin1.map.gz"

RDEPENDS_${PN} = "kbd-keymaps"