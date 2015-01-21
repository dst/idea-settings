#if (${PACKAGE_NAME} && $PACKAGE_NAME != "" )package ${PACKAGE_NAME}
#end

import groovy.transform.CompileStatic
import groovy.transform.PackageScope

#parse("File Header.java")
@PackageScope
@CompileStatic
class ${NAME} {
}
