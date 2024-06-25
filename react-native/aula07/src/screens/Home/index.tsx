import { View, Text, Button, ActivityIndicator, FlatList, TextInput, TouchableOpacity } from "react-native";
import { styles } from './styles'
import { deleteTaskById, getAllTasks, postTask, updateTask } from "../../services/tasksCRUD";
import { useContext, useEffect, useState } from "react";
import { Tasks } from "../../types";
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import api from "../../services/api";
import { AuthCtx } from "../../contexts/UserContext";


const Home = () => {

    const [allTasks, setAllTasks] = useState<Tasks[]>([]);
    const [isLoading, setLoading] = useState(false);
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");
    const [isEditing, setEditing] = useState({
        isEdit: false,
        id: '0'
    });
    const {logout} = useContext(AuthCtx);

    const getTasks = async () => {
        setLoading(true)

        try {
            const data = await getAllTasks();
            setAllTasks(data)
        } catch (err) {
            console.log(err)
        }
        setLoading(false)
    }

    const saveTask = async () => {
        setLoading(true)
        const newTask = {
            title: title,
            description: description,
            status: "pendente"
        }

        try {
            const task = await postTask(newTask);
            setAllTasks([...allTasks, task])
            console.log(task);
            setTitle("");
            setDescription("");

        } catch (erro) {
            console.log(erro)
        }
        setLoading(false)
    }

    const deleteTask = async (id: string) => {
        setLoading(true)
        try {
            const deletedTask = await deleteTaskById(id)
            setAllTasks(allTasks.filter(item => item.id !== deletedTask.id))

        } catch (err) {
            console.log(err)
        }
        setLoading(false)

    };

    const editTask = async (task: Tasks) => {
        setEditing({
            isEdit: true,
            id: task.id
        })
        console.log(task)
        setTitle(task.title)
        setDescription(task.description)
    };

    const saveEditedTask = async () => {
        const editedTask = {
            title: title,
            description: description
        };
        try {
            const updatedTask = await updateTask(isEditing.id, editedTask);
            setAllTasks(allTasks.map(item => {
                if (item.id === isEditing.id) {
                    return updatedTask
                }
                return item
            })
            );
            console.log(updateTask);
            cancelEdit();

        } catch (err) {
            console.log(err);
        };
    };

    const cancelEdit = () => {
        setTitle("");
        setDescription("")
        setEditing({
            isEdit: false,
            id: "0"
        })
    }
    useEffect(() => {
        getTasks();
    }, [])

    if (isLoading) {
        return (
            <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
                <ActivityIndicator size="large" />
            </View>
        )
    }

    return (
        <View style={styles.container}>
            <Text>Lista de Tarefas</Text>
            <View>
                <TextInput
                    placeholder="Título da Tarefa"
                    value={title}
                    onChangeText={setTitle}
                />
                <TextInput
                    placeholder="Descrição da Tarefa"
                    value={description}
                    onChangeText={setDescription}
                />
                {isEditing.isEdit ? (
                    <View style={{ gap: 8 }}>
                        <Button title="Salvar" onPress={saveEditedTask} />
                        <Button title="Cancelar" onPress={cancelEdit} />
                    </View>
                ) : (
                    <Button title="Adicionar Tarefa" onPress={saveTask} />
                )
                }
                <Button title="LOGOUT" onPress={logout}/>
            </View>
            <FlatList
                data={allTasks}
                keyExtractor={item => item.id}
                renderItem={({ item }) =>
                    <View style={styles.listItem}>
                        <Text> TITLE:{item.title}</Text>
                        <Text> DESCRIPTION:{item.description}</Text>
                        <Text> STATUS:{item.status}</Text>
                        <View style={styles.listIconContainer}>
                            <TouchableOpacity onPress={() => editTask(item)}>
                                <FontAwesome5 name="edit" size={24} color="black" />
                            </TouchableOpacity>
                            <TouchableOpacity onPress={() => deleteTask(item.id)}>
                                <FontAwesome5 name="trash-alt" size={24} color="black" />
                            </TouchableOpacity>
                        </View>
                    </View>
                }
            />
        </View>
    );
};

export default Home;