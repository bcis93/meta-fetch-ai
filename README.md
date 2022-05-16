# OpenEmbedded/Yocto layer for Fetch AI's AEA framework
The `meta-fetch-ai` layer adds the AEA framework into a Yocto build.

For more information on Fetch AI or AEAs, visit [fetch.ai](https://fetch.ai/) or [docs.fetch.ai](https://docs.fetch.ai/)

## Usage

For example usage, please refer to the [fetch-ai-demo-distro](https://github.com/bcis93/fetch-ai-demo-distro) repository.

## Motivation

Installing the AEA framework as part of a Yocto build has the following advantages over other approaches such as pip and docker
- No setup needed on first boot. There is no need to install anything or pull a docker image. This saves time, device resources, and network usage.
Once the device powers on, it's ready to go!
- Fewer dependencies. There's no need to install docker, for example, if image size is a concern.
- Same version, every time. All devices deployed with the same Yocto image will have the same version of AEA. Running `pip3 install aea`, for example,
will automatically install the latest, meaning devices may be running different versions of AEA depending on when they were deployed. Using Yocto
ensures that all devices deployed with the same image will have the same version of AEA.

## Current Status

Currently, the build succeeds, and running `aea` on the target device runs without errors.

The following list describes the tasks to be completed next:
- Ensure an example AEA can run without dependency errors.
- Add a `.bbclass` that can add actual AEAs (not just the framework) to the Yocto build. This class would handle everything regarding fetching,
installing, and building an AEA. Additionally, it would provide an option to run the AEA on boot.
- Test on other devices. Currently this layer has only been tested on a RaspberryPi 4. Testing should be done for other platforms, such as
Nvidia Jetson.

## Issues and Contributing

If you encounter a build or run-time issue or would like to contribute, please create an issue or submit a pull request. Contributions are appreciated!
