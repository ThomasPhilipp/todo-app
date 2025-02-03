package com.myorg;

import dev.stratospheric.cdk.SpringBootApplicationStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;

import static java.util.Objects.requireNonNull;

public class AwsCdkApp {
    public static void main(final String[] args) {
        // creates an app instance
        App app = new App();

        // read context variables which are assigned, e.g.
        // $ cdk deploy -c accountId=<id> -c region=<id>
        String accountId = (String) app.getNode().tryGetContext("accountId");
        requireNonNull(accountId, "context variable 'accountId' must not be null");

        String region = (String) app.getNode().tryGetContext("region");
        requireNonNull(region, "context variable 'region' must not be null");

        // create a stack instance which is used by the app
        new SpringBootApplicationStack(
                app,
                "SpringBootApplication",
                makeEnv(accountId, region),
                "docker.io/stratospheric/todo-app-v1:latest");

        // creates the cdk.out folder
        app.synth();
    }

    private static Environment makeEnv(String accountId, String region) {
        return Environment.builder().account(accountId).region(region).build();
    }
}

