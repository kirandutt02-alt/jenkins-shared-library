def call(String path) {
    dir(path) {
        sh 'ansible-playbook -i inventory site.yml'
    }
}