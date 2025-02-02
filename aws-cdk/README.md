# Welcome to your CDK Java project!

This is a blank project for CDK development with Java.

The `cdk.json` file tells the CDK Toolkit how to execute your app. It uses the [Maven Wrapper](https://github.com/apache/maven-wrapper) project to build and run tests (see also the `cdk.json` file).  

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!

## AWS Setup

* Create a new IAM user and assign the following permissions/policies
```
AmazonRDSFullAccess
AmazonEC2ContainerRegistryFullAccess 
SystemAdministrator
AmazonEC2FullAccess
AmazonECS_FullAccess
AWSCertificateManagerFullAccess
AWSLambda_FullAccess
AWSCloudFormationFullAccess
AmazonCognitoPowerUser
AmazonS3FullAccess
AmazonSSMFullAccess
IAMReadOnlyAccess
AWSKeyManagementServicePowerUser
AmazonMQApiFullAccess
CloudWatchSyntheticsFullAccess
```

## Initial setup commands

* `cdk init app --language=java` create this project
* `cdk bootstrap aws://<account-number>/<region>` prepare project (S3 bucket, IAM, ECR, etc.) in region, e.g. `cdk bootstrap aws://609769317725/eu-central-1`
* `cdk deploy`
* `cdk destroy`
## 