# epam-cloudx-associate-dev-2021q2

## 01 Create AWS Account

> sh createImage.sh

## 03 EC2

user data as text

```shell
#!/bin/bash
sudo yum update -y
sudo amazon-linux-extras install docker -y
sudo service docker start
sudo usermod -a -G docker ec2-user
docker run --rm --name myapp -p 8080:8080 -d loremipsum2021/myapp:2021.06.07.1
```
