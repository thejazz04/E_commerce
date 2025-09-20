import { Button } from "@/components/ui/button"
import {
  Table,
  TableBody,
  TableCell,
  TableHead,
  TableHeader,
  TableRow,
} from "@/components/ui/table"
import { ShoppingBag } from "lucide-react"
import { useState } from "react"
import {
  Dialog,
  DialogClose,
  DialogContent,
  DialogFooter,
  DialogHeader,
  DialogTitle,
} from "@/components/ui/dialog"
import {
  Select,
  SelectContent,
  SelectGroup,
  SelectItem,
  SelectLabel,
  SelectTrigger,
  SelectValue,
} from "@/components/ui/select"

const AdminOrders = () => {

  const [editOpen, setEditOpen] = useState(false)
  return (
    <div className="p-4 flex justify-center items-center w-full flex-col gap-4">
      <div className="w-full flex flex-row">
        <div className="w-1/2 flex justify-start items-center">
          <h2 className="font-bold ">Orders</h2>
        </div>

      </div>
      <Table className="w-full bg-gray-50 p-4 rounded-md">
        <TableHeader className="bg-gray-300">
          <TableRow>
            <TableHead>User Name</TableHead>
            <TableHead>Item Summary</TableHead>
            <TableHead>Total Price</TableHead>
            <TableHead>Order Status</TableHead>
            <TableHead>Order Date</TableHead>
            <TableHead>Address</TableHead>
            <TableHead className="text-right">Actions</TableHead>
          </TableRow>
        </TableHeader>
        <TableBody>
          <TableRow>
            <TableCell className="font-medium">Mohanraj</TableCell>
            <TableCell >Phone 1 ,phone 2</TableCell>
            <TableCell>400000</TableCell>
            <TableCell>Delivered</TableCell>
            <TableCell>02/04.2026</TableCell>
            <TableCell>1/11,state,111-222</TableCell>
            <TableCell className="text-right">
              <Button className="border-2 border-cyan-600 cursor-pointer" variant='outline' onClick={() => { setEditOpen(true) }}>
                <ShoppingBag className="h-8 w-8 text-cyan-600" />
              </Button>
            </TableCell>
          </TableRow>
        </TableBody>
      </Table>

      <Dialog open={editOpen}>
        <form>
          <DialogContent className="sm:max-w-[425px]">
            <DialogHeader>
              <DialogTitle>Update Status</DialogTitle>
            </DialogHeader>
            <div className="grid gap-4">
              <Select>
                <SelectTrigger className="w-full">
                  <SelectValue placeholder="Order Status" />
                </SelectTrigger>
                <SelectContent>
                  <SelectGroup>
                    <SelectLabel>Order Status</SelectLabel>
                    <SelectItem value="pending">Pending</SelectItem>
                    <SelectItem value="shipped">Shipped</SelectItem>
                    <SelectItem value="cancelled">Cancelled</SelectItem>
                    <SelectItem value="delivered">Delivered</SelectItem>
                  </SelectGroup>
                </SelectContent>
              </Select>
              <div className="grid gap-3">
                <p>Address </p>
                <p className="font-semibold">1/22</p>
              </div>
            </div>
            <DialogFooter>
              <DialogClose asChild>
                <Button variant="outline" onClick={() => { setEditOpen(false) }}>Cancel</Button>
              </DialogClose>
              <Button type="submit">Save changes</Button>
            </DialogFooter>
          </DialogContent>
        </form>
      </Dialog>
    </div>
  )
}

export default AdminOrders