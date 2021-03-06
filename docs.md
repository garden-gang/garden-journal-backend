## Plants

### Retrieve a specific plant

`GET` `/plants/{plantId}`

#### Response

```typescript
interface GetPlantResponse {
    id: string
    createdAt: Long
    name: string
    type: string
}
```

### Retrieve all plants

`GET` `/plants`

#### Response

```typescript
Array<GetPlantResponse>
```

### Create a plant

`POST` `/plants`

#### Request

```typescript
interface PostPlantRequest {
    name: string
    type: string
    createdAt: Long
}
```


## Journal Entries

### Submit all journal entries

`POST` `/plants/{plantId}/journal-entries`

```typescript
interface JournalEntryRequest {
  createdAt: Long
  type: string
  data: string
}
```

`GET` `/plants/{plantId}/journal-entries`

#### Query parameters

 * `sort=createdAt` - Sorts the entries retrieved by date created
 * `order=desc` - sorts the entries in descending order
 * `type=image` - filters only the image types

#### Request

```typescript
interface JournalEntryResponse {
  id: string  
  plantId: string
  createdAt: Long
  type: string
  data: string,
  dataUrl: string
}
```

#### Response

```typescript
Array<JournalEntryResponse>
```
#### Delete single plant
`DELETE` `/plants/${id}`
