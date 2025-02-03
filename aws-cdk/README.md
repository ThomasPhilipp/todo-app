# Welcome to your CDK Java project!

This is a blank project for CDK development with Java.

The `cdk.json` file tells the CDK Toolkit how to execute your app. It uses the [Maven Wrapper](https://github.com/apache/maven-wrapper) project to build and run tests (see also the `cdk.json` file).  

## Prerequisites 

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

## Useful commands

### Setup & Configuration

* `cdk init app --language=java` create this project
* `cdk bootstrap aws://<account-number>/<region>` prepare project (S3 bucket, IAM, ECR, etc.) in region, e.g. `cdk bootstrap aws://609769317725/eu-central-1`

### Development & Operations
*
* `mvn package`     compile and run tests
* `cdk ls`          list all stacks in the app
* `cdk synth`       emits the synthesized CloudFormation template
* `cdk deploy`      deploy this stack to your default AWS account/region
* `cdk diff`        compare deployed stack with current state
* `cdk docs`        open CDK documentation

* `cdk deploy -c accountId=<number> -c region=<key>` deploy the CDK project aka stack, e.g. `cdk deploy -c accountId=609769317725 -c region=eu-central-1`
* `cdk destroy -c accountId=<number> -c region=<key>` destroy the CDK project aka stack, e.g. `cdk destroy -c accountId=609769317725 -c region=eu-central-1`

## Troubleshooting

For troubleshooting we can add the `--verbose` argument to the deploy command. Also, we can look into the services of the AWS Console:
* CloudFormation
* ECR
* ECS
* CloudWatch
* etc.