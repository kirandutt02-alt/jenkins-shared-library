def call(String path) {
    sh "ansible-playbook -i ${path}/inventory/hosts.ini ${path}/inventory/site.yml"
}
