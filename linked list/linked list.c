#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Xác định kiểu dữ liệu của mỗi node
typedef enum {
    INT,
    FLOAT,
    STRING
} DataType;

// Cấu trúc của một node
typedef struct Node {
    void *data;        // Con trỏ dữ liệu tổng quát
    DataType type;     // Kiểu dữ liệu của node
    struct Node *next; // Con trỏ đến node tiếp theo
} Node;

// Hàm tạo một node mới
Node* createNode(void *data, DataType type) {
    Node *newNode = (Node*) malloc(sizeof(Node));
    newNode->type = type;
    newNode->next = NULL;

    // Cấp phát bộ nhớ cho dữ liệu và sao chép vào node
    if (type == INT) {
        newNode->data = malloc(sizeof(int));
        *(int*)newNode->data = *(int*)data;
    } else if (type == FLOAT) {
        newNode->data = malloc(sizeof(float));
        *(float*)newNode->data = *(float*)data;
    } else if (type == STRING) {
        newNode->data = malloc(strlen((char*)data) + 1);
        strcpy((char*)newNode->data, (char*)data);
    }

    return newNode;
}

// Hàm thêm node vào cuối danh sách
void append(Node **head, void *data, DataType type) {
    Node *newNode = createNode(data, type);
    if (*head == NULL) {
        *head = newNode;
        return;
    }

    Node *temp = *head;
    while (temp->next) {
        temp = temp->next;
    }
    temp->next = newNode;
}

// Hàm hiển thị danh sách liên kết
void printList(Node *head) {
    Node *temp = head;
    while (temp) {
        printf("Data: ");
        if (temp->type == INT) {
            printf("%d (int)", *(int*)temp->data);
        } else if (temp->type == FLOAT) {
            printf("%.2f (float)", *(float*)temp->data);
        } else if (temp->type == STRING) {
            printf("%s (string)", (char*)temp->data);
        }
        printf("\n");
        temp = temp->next;
    }
}

// Hàm giải phóng bộ nhớ
void freeList(Node *head) {
    Node *temp;
    while (head) {
        temp = head;
        head = head->next;
        free(temp->data); // Giải phóng dữ liệu động
        free(temp);
    }
}

// Main function
int main() {
    Node *head = NULL;

    int intVal = 42;
    float floatVal = 3.14;
    char strVal[] = "Hello, world!";

    append(&head, &intVal, INT);
    append(&head, &floatVal, FLOAT);
    append(&head, strVal, STRING);

    printf("Danh sách liên kết:\n");
    printList(head);

    freeList(head); // Giải phóng bộ nhớ
    return 0;
}
