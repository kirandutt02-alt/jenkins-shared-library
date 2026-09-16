def call(String path) {
    dir(path) {
        sh "ansible-playbook -i ${path}/inventory/hosts.ini playbook.yml"
    }
}