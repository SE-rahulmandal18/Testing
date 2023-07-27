# Use the ubuntu base image
FROM ubuntu

# Set the working directory inside the container
WORKDIR /app

# Copy a script file to the container
COPY script.sh .

# Make the script executable
RUN chmod +x script.sh

# Run the script when the container starts
CMD ["./script.sh"]

 # Command to run the docker image-> docker build -t (image_name->mydockerimage)



