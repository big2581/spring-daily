package com.big;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-09-29 10:15
 */
@Annotation(show1 = 1,
        show2 = "2",
        show3 = StatusEnum.P1,
        show4 = @OtherAnnotation("s"),
        strs = {"1", "2"})
public class StudyAnnotation {

    public static void main(String[] args) {
        Class<StudyAnnotation> annotationClass = StudyAnnotation.class;


        com.big.Annotation annotation = annotationClass.getAnnotation(com.big.Annotation.class);

        System.out.println(annotation.show1());
        System.out.println(annotation.show2());
        System.out.println(annotation.show3());
        System.out.println(annotation.show4());
//        System.out.println(annotation.strs());
    }
}
