# Liferay 7.2 SP6 Sample
## Precondition
- JDK 1.8
- `Liferay Developer Studio` with Workspace (`Blade tool`) are installed.
- Liferay 7.2 SP6 (Please take look at `gradle.properties` in the root directory.)

# How to make it work
1. Clone this repository to your local.
1. Change `liferay.workspace.home.dir` in the `gradle.properties` compatible to your environment. Point your 7.2 SP6 bundle's root directory
1. Make sure you are using `Java 8`
1. Spin up the bundle
1. Go to `modules/sample/` and run `blade deploy`
1. sample-web, sample-service, sample-api would be all deployed to the bundle's deploy directory, and you see each bundles`STARTED` in the console
1. Access `localhost:8080` and login as Administrator, then change the page to the edit mode.
1. Place `sample` widgets in `Samples` group.
1. In the sample widget, type something in the text area and press submit
1. You'll see the default site member users' amount in the console.