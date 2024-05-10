const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmhydsk/",
            name: "ssmhydsk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmhydsk/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "旅游出行必备商城小程序"
        } 
    }
}
export default base
