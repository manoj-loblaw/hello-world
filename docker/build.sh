docker build . -f docker/Dockerfile -t gcr.io/$GOOGLE_CLOUD_PROJECT && docker tag gcr.io/$GOOGLE_CLOUD_PROJECT gcr.io/$GOOGLE_CLOUD_PROJECT/hello-world && docker push gcr.io/$GOOGLE_CLOUD_PROJECT/hello-world