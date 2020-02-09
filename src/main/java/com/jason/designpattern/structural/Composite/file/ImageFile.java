package com.jason.designpattern.structural.Composite.file;

import com.jason.commons.exception.CompositeOperationException;

/**
 * @author ChenHol.Wong
 * @create 2020/2/8 20:25
 */
public class ImageFile extends AbstractFile {
    public ImageFile(String fileName, String fileType, int fileSize) {
        super(fileName, fileType, fileSize);
    }

    @Override
    public void add(AbstractFile file) {
        try {
            throw new CompositeOperationException("图片不支持添加");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(AbstractFile file) {
        try {
            throw new CompositeOperationException("图片不支持移除");
        } catch (CompositeOperationException e) {
            System.out.println(e);
        }
    }

    @Override
    public void display() {
        System.out.println("直接打开图片：" + fileName + "（文件类型：" + fileType + "，文件大小：" + fileSize + "kb）");
    }
}
