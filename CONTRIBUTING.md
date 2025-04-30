# Contributing

If you are interested in contributing, you may do so via a pull request. If you would like to discuss your findings you can do so via the [Discord](https://discord.gg/TYTQmatbse) server or the discussion tab of this repository.

# Guidelines

- All variables and methods, unless taken from official Gameloft code (as in code from other unobfuscated Gameloft games or leaked code), should follow [Java naming conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html).
	- Names should be descriptive and not generic (existing decompiler-generated names are exempt from this).
	- Abbreviate only when a name becomes excessively long, and do so consistently. The word current", for example, should always be abbreviated as "crt", regardless of how long the full name is. So `isCrtSelectSealItemNeedUpdate` and `crtSealArrowOffsetX`, for example, are both using the same abbreviation for "current", even though one name is much longer than the other.
- Do not rename any methods or variables with names derived from official code. As of right now, this only applies to the `ASprite` and `ASpriteInstance` classes.
- Make sure that code is kept logically indentical when restructuring label-heavy code. You should test your changes to ensure they don't introduce any bugs that weren't present in the original game.
