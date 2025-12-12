use strict;
#  MaterialColor("primary", MaterialTheme.colorScheme.primary),
while (<>) {
    if (/(.*) (.*)/) {
        printf("MaterialColor(\"%s\", MaterialTheme.colorScheme.%s, \"%s\", MaterialTheme.colorScheme.%s),\n", $1, $1, $2, $2 );
    } else {
        printf("bad line: $_")
    }
}
