import sys
from PyQt6.QtWidgets import QApplication, QWidget, QLabel, QLineEdit, QComboBox, QPushButton, QVBoxLayout
import sqlite3

class WorkshopRegistrationForm(QWidget):
    def __init__(self):
        super().__init__()

        self.initUI()

    def initUI(self):
        self.name_label = QLabel('Name:')
        self.name_edit = QLineEdit(self)
        self.email_label = QLabel('Email:')
        self.email_edit = QLineEdit(self)
        self.workshop_label = QLabel('Workshop:')
        self.workshop_combobox = QComboBox(self)
        self.workshop_combobox.addItems(['Workshop A', 'Workshop B', 'Workshop C'])

        self.submit_button = QPushButton('Submit', self)
        self.submit_button.clicked.connect(self.submit)

        layout = QVBoxLayout()
        layout.addWidget(self.name_label)
        layout.addWidget(self.name_edit)
        layout.addWidget(self.email_label)
        layout.addWidget(self.email_edit)
        layout.addWidget(self.workshop_label)
        layout.addWidget(self.workshop_combobox)
        layout.addWidget(self.submit_button)

        self.setLayout(layout)

    def submit(self):
        name = self.name_edit.text()
        email = self.email_edit.text()
        workshop = self.workshop_combobox.currentText()

        self.store_data(name, email, workshop)

    def store_data(self, name, email, workshop):
        conn = sqlite3.connect('workshop_registration.db')
        cursor = conn.cursor()
        cursor.execute('CREATE TABLE IF NOT EXISTS registrations (name TEXT, email TEXT, workshop TEXT)')
        cursor.execute('INSERT INTO registrations VALUES (?, ?, ?)', (name, email, workshop))
        conn.commit()
        conn.close()
        self.clear_form()

    def clear_form(self):
        self.name_edit.clear()
        self.email_edit.clear()
        self.workshop_combobox.setCurrentIndex(0)

def main():
    app = QApplication(sys.argv)
    form = WorkshopRegistrationForm()
    form.setWindowTitle('Workshop Registration Form')
    form.show()
    sys.exit(app.exec())

if __name__ == '__main__':
    main()
