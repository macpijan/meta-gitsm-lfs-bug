LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "gitsm://github.com/macpijan/gitsm-lfs-bug-main-repo.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "b4be8b8e81b1cce5e499df49a690a7cbd31afb17"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
        # Specify any needed configure commands here
        :
}

do_compile () {
        # Specify compilation commands here
        :
}

do_install () {
        # Specify install commands here
        :
}
