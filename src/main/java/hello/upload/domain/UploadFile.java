package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    /**
     * 사용자 업로드한 파일 명으로 서버 내부에 파일을 저장하면 안된다.
     * 서로 다른 사용자가 같은 파일이름을 업로드하는 경우 기존 파일 이름과 충돌 발생
     * 서버에서는 저장할 파일명이 겹치지 않도록 내부에서 관리하는 별도의 파일명 필요
     */

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

}
