package io.lecture.core.api.controller.v1.request;

import io.lecture.domain.lecture.NewLectureRegs;
import jakarta.validation.constraints.NotNull;

public record ApplyLectureRequest(
        @NotNull Integer employeeNumber
) {
    public NewLectureRegs toLectureRegs(Long lectureId) {
        return new NewLectureRegs(
                this.employeeNumber,
                lectureId
        );
    }
}