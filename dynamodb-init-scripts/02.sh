#!/bin/bash

echo "########### Creating table ###########"
aws $AWS_ENDPOINT \
    dynamodb create-table \
      --table-name tbeq3171_pess_dynamo \
      --attribute-definitions \
        AttributeName=cod_idef_pess_orco,AttributeType=S \
      --key-schema \
        AttributeName=cod_idef_pess_orco,KeyType=HASH \
      --provisioned-throughput \
        ReadCapacityUnits=5,WriteCapacityUnits=5 \

echo "########### Describing a table ###########"
aws $AWS_ENDPOINT \
    dynamodb describe-table --table-name tbeq3171_pess_dynamo --output table
