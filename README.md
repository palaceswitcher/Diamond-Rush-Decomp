# Diamond-Rush-Decomp

A decompilation of Gameloft's 2006 J2ME game, Diamond Rush. This is specifically the non-padlock version (v1.2.0) for the Sony Ericsson S700. The aim is not to get a bytecode identical decompilation but rather deobfuscate it enough for the code to be readable and logically identical to the original.

## Building

### J2ME Setup

- [Windows](https://nnp.nnchan.ru/wiki/?page=j2medevwin)
- [Linux](https://nnp.nnchan.ru/wiki/?page=j2medevlinux)

You may need to add `ulimit -n 10000` to `KEmulator.sh` and `uei/emulator` if you get an error about memory on Linux. You may also have to set the executable flag of the executables (including in the `uei` folder) for nnmod to be detected as a device by Eclipse.

### Eclipse Setup

1. Create a new Java ME project
2. Copy the contents of the repository to the root of the project directory
3. If needed, create a new Run Configuration by going to Run > Configurations. You should be able to build and run the game via this configuration.
