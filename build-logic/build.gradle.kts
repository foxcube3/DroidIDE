
plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("root-project") {
            id = "build-logic.root-project"
            implementationClass = "RootProjectPlugin"
        }
    }
}
