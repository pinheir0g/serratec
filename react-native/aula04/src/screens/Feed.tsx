import { Button, Image, StyleSheet, Text, View } from "react-native"
import { FeedProps } from "../routes/stack";
import axios from "axios";
import {Cat} from '../types'
import { useEffect, useState } from "react";



const Feed = ({route}: FeedProps) => {

    const [cat, setCat] = useState<Cat[]>([])
    const props = route.params;

    const fetchData = async () => {
        // const dadosFetch = fetch('https://api.thecatapi.com/v1/images/search')
        // .then((resp) => JSON.parse(resp))
        // .then(dados => console.log("FETCH: ", dados))
        // .catch(e => console.log(e)) 

        try{
            const {data} = await axios.get('https://api.thecatapi.com/v1/images/search');
            setCat(data)
            console.log("AXIOS: ", data)
            
        }catch (err){
            console.log(err)
        }
    };

    useEffect(() => {
        fetchData();
    }, [])

    return (
        <View>
            <Text style={styles.texto}> {props?.info}</Text>
            {/* <Text style={styles.texto}> Gatin id: {cat[0]?.id} </Text> */}
            <Image style={{width:200, height:200}} source={{
                uri: cat[0]?.url
            }}/>
            <Button title="Obter Dados" onPress={fetchData}/>
        </View>
    );
}

const styles = StyleSheet.create({
    texto:{
        textAlign: 'center',
        fontSize: 50
    },
    img:{
        
    }
})
export default Feed