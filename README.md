# shade-plugin-experiment
Experimenting Shade plugin

Read about shading here - https://medium.com/@akhaku/java-class-shadowing-and-shading-9439b0eacb13

# Some more points
1. The above article says that you can shade transitive dependencies easily. But it's not the case with maven shade plugin.
2. Maven shade plugin, when used, only shades a single dependency. It doesn't shade transitive dependencies of the shaded dependency.
3. For e.g., if this project depends on A & B, and A depends on v1 of C, while B depends on v2 of C, we'd like to shade A's (or B's) version of C.4. But it's not possible. 
4. There's however a workaround to it -> https://stackoverflow.com/questions/30575528/shade-relocate-one-version-of-a-transitive-dependency-but-not-the-other
5. If our project includes a dependency A which is a Uber/Fat jar, then in the final Uber/Fat jar we create for our project will have A dependencies in the same namespace as a Fat jar will have only one namespace, unless A's dependencies are explicitly renamed (while shading).
