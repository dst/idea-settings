#if (${PACKAGE_NAME} && $PACKAGE_NAME != "" )package ${PACKAGE_NAME}
#end

import groovy.transform.PackageScope

#parse("File Header.java")
@PackageScope
class ${NAME} {
}
