FROM gitpod/workspace-full
SHELL ["/bin/bash", "-c"]

RUN sudo apt-get -qq update
# Install required libraries for Projector + PhpStorm
RUN sudo apt-get -qq install -y python3 python3-pip libxext6 libxrender1 libxtst6 libfreetype6 libxi6
# Install Projector
RUN pip3 install projector-installer
# Install PhpStorm
RUN mkdir -p ~/.projector/configs  # Prevents projector install from asking for the license acceptance
# Must use autoinstall with parameters to make IDEA Ultimate work - found out by https://github.com/JetBrains/projector-installer/blob/842c82b127df0087e3d7e85ab1561fbb36c13f1a/COMMANDS.md#ide-commands 
RUN projector ide autoinstall --config-name Idea --ide-name "IntelliJ IDEA Ultimate 2022.1.2"

###
### Initiate a rebuild of Gitpod's image by updating this comment #1
###